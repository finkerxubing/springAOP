package com.aop;

public class ProductDaoImpl implements ProductDao {

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("������Ʒ������");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("�޸���Ʒ������");

	}

	@Override
	public void find() {
		// TODO Auto-generated method stub
		System.out.println("������Ʒ������");
		int i=1/0;

	}

	@Override
	public String delete() {
		// TODO Auto-generated method stub
		System.out.println("ɾ����Ʒ������");
		return "aaa";
	}

}
