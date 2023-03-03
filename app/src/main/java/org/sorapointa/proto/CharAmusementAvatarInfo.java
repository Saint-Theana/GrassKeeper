package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CharAmusementAvatarInfo {
    @Tag(tag=11) public Integer uid = null;
    @Tag(tag=7) public Integer punishTime = null;
    @Tag(tag=10) public List<Integer> avatarIdList = new ArrayList<>();
}
