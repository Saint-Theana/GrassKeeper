package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum RogueDiaryAvatarDisableStatus {
        @Tag(tag=0) RogueDiaryAvatarDisableNone ,
        @Tag(tag=1) RogueDiaryAvatarDisableDeath ,
        @Tag(tag=2) RogueDiaryAvatarDisableTired ,
        @Tag(tag=3) RogueDiaryAvatarDisableDuplicated ;
}
