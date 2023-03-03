package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UpdatePlayerShowAvatarListReq {
    @Tag(tag=15) public Boolean isShowAvatar = null;
    @Tag(tag=13) public List<Integer> showAvatarIdList = new ArrayList<>();
}
