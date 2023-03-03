package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarChangeAnimHashReq {
    @Tag(tag=6) public Integer animHash = null;
    @Tag(tag=3) public Long avatarGuid = null;
}
