package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AvatarInfo.*;
import org.sorapointa.proto.AvatarInfo;

public class AvatarAddNotify {
    @Tag(tag=13) public AvatarInfo avatar = null;
    @Tag(tag=12) public Boolean isInTeam = null;
}
