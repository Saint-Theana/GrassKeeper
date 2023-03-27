package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum HomePlantFieldStatus {
        @Tag(tag=0) HomeFieldStatueNone ,
        @Tag(tag=1) HomeFieldStatueSeed ,
        @Tag(tag=2) HomeFieldStatueSprout ,
        @Tag(tag=3) HomeFieldStatueGather ;
}
