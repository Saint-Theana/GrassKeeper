package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RogueDiaryAvatar.*;
import org.sorapointa.proto.RogueDiaryAvatar;

public class RogueDiaryTiredAvatarNotify {
    @Tag(tag=10) public List<RogueDiaryAvatar> optionalTiredAvatarList = new ArrayList<>();
    @Tag(tag=6) public Integer reserveAvatarNum = null;
    @Tag(tag=8) public Integer tiredType = null;
    @Tag(tag=7) public Boolean isNeedShow = null;
}
