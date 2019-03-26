package com.capgemini.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.capgemini.test.BankAccount;
import com.capgemini.test.DebitCard;

public class Serialization {
			
		public static void main(String[] args)throws IOException, ClassNotFoundException{
			DebitCard debitcard=new com.capgemini.test.DebitCard(1111222233334444L,234,11,2012);
			BankAccount account=new BankAccount(101,"John","saving",3400,debitcard);
			
			FileOutputStream fileOutputStream=new FileOutputStream("account.serl");
			ObjectOutputStream outputStream=new ObjectOutputStream(fileOutputStream);
			
			outputStream.writeObject(account);
			outputStream.close();
			
			FileInputStream fileInputStream=new FileInputStream("account.serl");
			ObjectInputStream InputStream=new ObjectInputStream(fileInputStream);
			
			BankAccount account2=(BankAccount)InputStream.readObject();
			InputStream.close();
			System.out.println(account2);
		}
	}


