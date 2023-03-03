package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RogueDiaryAvatar.*;
import org.sorapointa.proto.RogueDiaryAvatar;

public class RogueDiaryReviveAvatarReq {
    @Tag(tag=2) public RogueDiaryAvatar reviveAvatar = null;
}
