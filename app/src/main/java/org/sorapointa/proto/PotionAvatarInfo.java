package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PotionAvatarInfo {
    @Tag(tag=10) public Long avatarId = null;
    @Tag(tag=3) public Boolean isTrial = null;
}
