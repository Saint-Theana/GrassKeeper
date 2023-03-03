package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ItemGivingRsp {
    @Tag(tag=1) public Integer givingGroupId = null;
    @Tag(tag=13) public Integer givingId = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
