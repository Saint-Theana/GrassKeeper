package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum FishEscapeReason {
        @Tag(tag=0) FisnEscapeNone ,
        @Tag(tag=1) FishEscapeShocked ,
        @Tag(tag=2) FishEscapeUnhook ;
}
