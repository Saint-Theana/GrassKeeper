package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UpdatePlayerShowAvatarListRsp {
    @Tag(tag=1) public List<Integer> showAvatarIdList = new ArrayList<>();
    @Tag(tag=3) public Boolean isShowAvatar = null;
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
}
