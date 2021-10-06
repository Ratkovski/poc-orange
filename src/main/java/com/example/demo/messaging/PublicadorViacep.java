package com.example.demo.messaging;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.model.SendMessageRequest;
import com.example.demo.domain.Viacep;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PublicadorViacep {

    private final AmazonSQS amazonSQS;
    private final ObjectMapper objectMapper;

    @SneakyThrows
    public void publicar(final Viacep viacep) {
        String queueUrl = amazonSQS.getQueueUrl("fila_viacep").getQueueUrl();
        SendMessageRequest send_msg_request = new SendMessageRequest()
                .withQueueUrl(queueUrl)
                .withMessageBody(objectMapper.writeValueAsString(viacep))
                .withDelaySeconds(5);
        amazonSQS.sendMessage(send_msg_request);
    }
}
