package demoGRPC_Clientcom.demo.grpc.client;

import com.demo.grpc.demoRequest;
import com.demo.grpc.demoResponse;
import com.demo.grpc.demoServiceGrpc;
import com.demo.grpc.demoServiceGrpc.demoServiceBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Demo_Client {

	public static void main(String[] args) {
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8086).usePlaintext().build();
		
		demoServiceBlockingStub demoServiceGrpcStub = demoServiceGrpc.newBlockingStub(channel);
		
		demoRequest demorequest = demoRequest.newBuilder().setId(4).setLabel("lengdon").build();
		
		demoResponse demoresponse = demoServiceGrpcStub.demoInsert(demorequest);
		
		System.out.println(demoresponse.getErrorCode());
		System.out.println(demoresponse.getErrorMessage());

		
		
	}
}
