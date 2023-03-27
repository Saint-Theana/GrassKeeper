package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum DataResVersionNotify_DataResVersionOpType {
        @Tag(tag=0) OpTypeNone ,
        @Tag(tag=1) OpTypeRelogin ,
        @Tag(tag=2) OpTypeMpRelogin ;
}
