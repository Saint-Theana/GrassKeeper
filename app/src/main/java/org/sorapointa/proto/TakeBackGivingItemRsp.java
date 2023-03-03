package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeBackGivingItemRsp {
    @Tag(tag=10) public Integer givingId = null;
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
}
