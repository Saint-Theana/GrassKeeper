package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum PlayerDieOption {
        @Tag(tag=0) DieOptNone ,
        @Tag(tag=1) DieOptReplay ,
        @Tag(tag=2) DieOptCancel ,
        @Tag(tag=3) DieOptRevive ;
}
