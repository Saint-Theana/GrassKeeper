package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarCardChangeReq {
    @Tag(tag=6) public Integer itemId = null;
    @Tag(tag=14) public Long avatarGuid = null;
    @Tag(tag=7) public Integer count = null;
}
