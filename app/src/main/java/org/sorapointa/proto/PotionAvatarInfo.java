package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PotionAvatarInfo {
    @Tag(tag=6) public Boolean isTrial = null;
    @Tag(tag=8) public Long avatarId = null;
}
