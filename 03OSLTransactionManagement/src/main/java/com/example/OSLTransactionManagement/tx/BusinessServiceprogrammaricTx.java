package com.example.OSLTransactionManagement.tx;

import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.support.TransactionTemplate;

@Service("businessServiceProgramaticTx")
public class BusinessServiceprogrammaricTx implements BusinessService {

	private final TransactionTemplate transactionTemplate;

	public BusinessServiceprogrammaricTx(PlatformTransactionManager platformTransactionManager) {
		this.transactionTemplate = new TransactionTemplate(platformTransactionManager);
		this.transactionTemplate.setTimeout(30);
		this.transactionTemplate.setIsolationLevel(TransactionDefinition.ISOLATION_READ_COMMITTED);

	}

	@Override
	public void doBusiness() {
		Object message = transactionTemplate.execute(status -> {
			return "Hello From transaction";
		});
		System.out.println(message.toString());

	}

}
