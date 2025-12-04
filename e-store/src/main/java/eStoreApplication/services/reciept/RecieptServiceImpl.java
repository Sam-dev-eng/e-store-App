package eStoreApplication.services.reciept;

import eStoreApplication.data.models.Receipt;
import eStoreApplication.data.repository.ReceiptRepository;
import eStoreApplication.dtos.requests.ConfirmPaymentRequest;
import eStoreApplication.dtos.requests.DeleteRecieptRequest;
import eStoreApplication.dtos.requests.FindAllRecieptRequest;
import eStoreApplication.dtos.requests.FindRecieptRequest;
import eStoreApplication.dtos.responses.ConfirmPaymentResponse;
import eStoreApplication.dtos.responses.DeleteRecieptResponse;
import eStoreApplication.dtos.responses.FindAllRecieptsResponse;
import eStoreApplication.dtos.responses.FindRecieptResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

    @Service
    @RequiredArgsConstructor
    public class RecieptServiceImpl implements RecieptServices {
        private ReceiptRepository receiptRepository;

        @Override
        public ConfirmPaymentResponse confirmPayment(ConfirmPaymentRequest request) {
            ConfirmPaymentResponse response = new ConfirmPaymentResponse();

            if (request == null) {
                response.setSuccess(false);
                response.setMessage("Request is null");
                return response;
            }

            if (request.getPayerName() == null || request.getPayerName().isEmpty()) {
                response.setSuccess(false);
                response.setMessage("Payer name is required");
                return response;
            }

            Receipt receipt = new Receipt(
                    request.getPayerName(),
                    request.getPayerNumber(),
                    request.getPayerEmail(),
                    request.getAmountPaid()
            );

            receipt.setProofOfPayment(request.getProofOfPayment());
            receipt.setPaymentDate(String.valueOf(LocalDate.now()));
            receipt.setHasPaid(true);

            Receipt savedReceipt = receiptRepository.save(receipt);

            response.setSuccess(true);
            response.setMessage("Payment confirmed successfully");
            response.setReceipt(savedReceipt);

            return response;
        }

        @Override
        public FindAllRecieptsResponse findAllReceipts(FindAllRecieptRequest request) {
            FindAllRecieptsResponse response = new FindAllRecieptsResponse();
            response.setReceipts(receiptRepository.findAll());
            response.setSuccess(true);
            response.setMessage("All receipts loaded");
            return response;
        }

        @Override
        public DeleteRecieptResponse deleteReceipt(DeleteRecieptRequest request) {
            DeleteRecieptResponse response = new DeleteRecieptResponse();

            if (!receiptRepository.existsById(request.getReceiptId())) {
                response.setSuccess(false);
                response.setMessage("Receipt not found");
                return response;
            }

            receiptRepository.deleteById(request.getReceiptId());
            response.setSuccess(true);
            response.setMessage("Receipt deleted successfully");
            return response;
        }



        @Override
        public FindRecieptResponse findReceipt(FindRecieptRequest request) {
            FindRecieptResponse response = new FindRecieptResponse();

            Receipt receipt = receiptRepository.findById(request.getReceiptId())
                    .orElse(null);

            if (receipt == null) {
                response.setSuccess(false);
                response.setMessage("Receipt not found");
                return response;
            }

            response.setSuccess(true);
            response.setMessage("Receipt found");
            response.setReceipt(receipt);
            return response;
        }
    }


