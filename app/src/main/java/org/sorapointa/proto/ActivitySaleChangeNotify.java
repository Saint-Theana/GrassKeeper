package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivitySaleChangeNotify {
    @Tag(tag=5) public Integer saleId = null;
    @Tag(tag=1) public Boolean isClose = null;
}
