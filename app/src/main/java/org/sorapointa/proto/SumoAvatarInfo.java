package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SumoAvatarInfo {
    @Tag(tag=2) public Boolean isTrial = null;
    @Tag(tag=1) public Long avatarId = null;
}
