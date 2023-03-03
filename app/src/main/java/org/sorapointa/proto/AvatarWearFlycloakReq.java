package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarWearFlycloakReq {
    @Tag(tag=11) public Long avatarGuid = null;
    @Tag(tag=13) public Integer flycloakId = null;
}
