package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HideAndSeekPlayerSetAvatarNotify {
    @Tag(tag=2) public Integer avatarId = null;
    @Tag(tag=13) public Integer costumeId = null;
    @Tag(tag=5) public Integer uid = null;
}
