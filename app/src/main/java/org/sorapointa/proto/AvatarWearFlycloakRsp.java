package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarWearFlycloakRsp {
    @Tag(tag=13) public Integer flycloakId = null;
    @Tag(tag=7) public Long avatarGuid = null;
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
}
