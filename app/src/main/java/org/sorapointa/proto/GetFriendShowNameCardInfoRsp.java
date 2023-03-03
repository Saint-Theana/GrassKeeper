package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetFriendShowNameCardInfoRsp {
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=7) public Integer uid = null;
    @Tag(tag=10) public List<Integer> showNameCardIdList = new ArrayList<>();
}
