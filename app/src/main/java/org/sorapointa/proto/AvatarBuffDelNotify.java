package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarBuffDelNotify {
    @Tag(tag=10) public Long avatarGuid = null;
    @Tag(tag=12) public Integer buffId = null;
}
