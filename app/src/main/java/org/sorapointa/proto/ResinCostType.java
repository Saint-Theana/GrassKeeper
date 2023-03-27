package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum ResinCostType {
        @Tag(tag=0) None ,
        @Tag(tag=1) Normal ,
        @Tag(tag=2) Condense ,
        @Tag(tag=3) ReunionPrivilege ,
        @Tag(tag=4) OpActivity ,
        @Tag(tag=5) Material ;
}
