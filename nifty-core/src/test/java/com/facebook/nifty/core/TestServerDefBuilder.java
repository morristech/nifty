package com.facebook.nifty.core;

import org.apache.thrift.TProcessor;
import org.easymock.EasyMock;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Author @jaxlaw
 * Date: 4/20/12
 * Time: 3:51 PM
 */
public class TestServerDefBuilder {

  @Test(groups = "fast")
  public void testServerDefBuilderWithoutProcesser() {
    try {
      new ThriftServerDefBuilder().build();
    } catch (Exception e) {
      return;
    }
    Assert.fail();
  }

  @Test(groups = "fast")
  public void testServerDefBuilder() {
    try {
      new ThriftServerDefBuilder()
        .withProcessor(EasyMock.createMock(TProcessor.class))
        .build();
    } catch (Exception e) {
      Assert.fail();
    }
  }
}
