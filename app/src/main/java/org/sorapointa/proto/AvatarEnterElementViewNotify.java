package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarEnterElementViewNotify {
    @Tag(tag=3) public Boolean isTriggered = null;
    @Tag(tag=12) public Integer avatarEntityId = null;
}
