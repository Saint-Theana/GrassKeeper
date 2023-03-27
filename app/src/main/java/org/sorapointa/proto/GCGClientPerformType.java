package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum GCGClientPerformType {
        @Tag(tag=0) GCGClientPerformTypeInvalid ,
        @Tag(tag=1) GCGClientPerformTypeCardExchange ,
        @Tag(tag=2) GCGClientPerformTypeFirstHand ,
        @Tag(tag=3) GCGClientPerformTypeReroll ;
}
