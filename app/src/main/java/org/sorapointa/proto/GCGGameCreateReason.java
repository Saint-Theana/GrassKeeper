package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum GCGGameCreateReason {
        @Tag(tag=0) None ,
        @Tag(tag=1) GameMax ,
        @Tag(tag=2) ClientVersionNotLatest ,
        @Tag(tag=3) ResourceNotComplete ,
        @Tag(tag=4) Timeout ,
        @Tag(tag=5) JBAKJAPPIEL ;
}
