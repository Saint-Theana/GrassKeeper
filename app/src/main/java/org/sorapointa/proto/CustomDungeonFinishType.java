package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum CustomDungeonFinishType {
        @Tag(tag=0) CustomDungeonFinishPlayNormal ,
        @Tag(tag=1) CustomDungeonFinishPlayTry ,
        @Tag(tag=2) CustomDungeonFinishEditTry ,
        @Tag(tag=3) CustomDungeonFinishSelfPlayNormal ;
}
