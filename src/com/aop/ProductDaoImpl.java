package com.aop;

public class ProductDaoImpl implements ProductDao {

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("保存商品。。。");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("修改商品。。。");

	}

	@Override
	public void find() {
		// TODO Auto-generated method stub
		System.out.println("查找商品。。。");
		int i=1/0;

	}

	@Override
	public String delete() {
		// TODO Auto-generated method stub
		System.out.println("删除商品。。。");
		return "aaa";
	}

}
