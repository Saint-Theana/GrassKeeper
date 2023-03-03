package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarFlycloakChangeNotify {
    @Tag(tag=8) public Integer flycloakId = null;
    @Tag(tag=2) public Long avatarGuid = null;
}
