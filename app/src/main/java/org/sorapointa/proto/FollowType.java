package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum FollowType {
        @Tag(tag=0) FollowTypeInitFollowPos ,
        @Tag(tag=1) FollowTypeSetFollowPos ,
        @Tag(tag=2) FollowTypeSetAbsFollowPos ;
}
