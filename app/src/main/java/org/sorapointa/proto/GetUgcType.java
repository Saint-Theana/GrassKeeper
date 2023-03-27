package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum GetUgcType {
        @Tag(tag=0) GetUgcNone ,
        @Tag(tag=1) Mine ,
        @Tag(tag=2) Publish ;
}
