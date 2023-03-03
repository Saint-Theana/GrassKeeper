package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WinterCampGiveFriendItemRsp {
    @Tag(tag=11) public List<Integer> limitItemIdList = new ArrayList<>();
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
