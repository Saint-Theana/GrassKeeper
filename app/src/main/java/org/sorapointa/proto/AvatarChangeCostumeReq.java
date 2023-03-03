package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarChangeCostumeReq {
    @Tag(tag=4) public Integer costumeId = null;
    @Tag(tag=2) public Long avatarGuid = null;
}
