package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum EnterCustomDungeonType {
        @Tag(tag=0) EnterCustomDungeonNone ,
        @Tag(tag=1) EnterCustomDungeonEdit ,
        @Tag(tag=2) EnterCustomDungeonPlay ,
        @Tag(tag=3) EnterCustomDungeonOfficial ;
}
