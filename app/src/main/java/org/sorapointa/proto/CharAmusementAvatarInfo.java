package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CharAmusementAvatarInfo {
    @Tag(tag=3) public Integer uid = null;
    @Tag(tag=11) public List<Integer> avatarIdList = new ArrayList<>();
    @Tag(tag=1) public Integer punishTime = null;
}
