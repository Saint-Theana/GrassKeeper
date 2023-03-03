package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FocusAvatarReq {
    @Tag(tag=1) public Long avatarGuid = null;
    @Tag(tag=8) public Boolean isFocus = null;
}
