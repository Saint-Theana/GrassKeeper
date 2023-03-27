package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum PathStatusType {
        @Tag(tag=0) StatusFail ,
        @Tag(tag=1) StatusSucc ,
        @Tag(tag=2) StatusPartial ;
}
