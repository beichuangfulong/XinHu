package com.webtest.demo;

import com.webtest.dataprovider.NSDataProvider;

public @interface Test {

	String dataProvider();

	Class<NSDataProvider> dataProviderClass();

}
