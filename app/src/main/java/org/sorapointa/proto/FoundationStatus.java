package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum FoundationStatus {
        @Tag(tag=0) None ,
        @Tag(tag=1) Init ,
        @Tag(tag=2) Building ,
        @Tag(tag=3) Built ;
}
