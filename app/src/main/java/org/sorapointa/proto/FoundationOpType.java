package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum FoundationOpType {
        @Tag(tag=0) FoundationOpNone ,
        @Tag(tag=1) FoundationOpBuild ,
        @Tag(tag=2) FoundationOpDemolition ,
        @Tag(tag=3) FoundationOpRebuild ,
        @Tag(tag=4) FoundationOpRotate ,
        @Tag(tag=5) FoundationOpLock ,
        @Tag(tag=6) FoundationOpUnlock ;
}
