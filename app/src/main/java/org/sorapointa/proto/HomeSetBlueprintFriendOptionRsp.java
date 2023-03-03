package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeSetBlueprintFriendOptionRsp {
    @Tag(tag=2) public Boolean isAllowFriendCopy = null;
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
}
