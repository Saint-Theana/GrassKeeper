package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum CustomDungeonState {
        @Tag(tag=0) Edit ,
        @Tag(tag=1) SelfPass ,
        @Tag(tag=2) Published ;
}
