package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum CreateReason {
        @Tag(tag=0) CreateNone ,
        @Tag(tag=1) CreateQuest ,
        @Tag(tag=2) CreateEnergy ;
}
