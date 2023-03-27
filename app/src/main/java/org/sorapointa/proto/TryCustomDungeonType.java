package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum TryCustomDungeonType {
        @Tag(tag=0) TryCustomDungeonNone ,
        @Tag(tag=1) TryCustomDungeonRoom ,
        @Tag(tag=2) TryCustomDungeonAll ,
        @Tag(tag=3) TryCustomDungeonOfficialPlay ;
}
