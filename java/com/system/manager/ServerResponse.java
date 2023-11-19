package com.system.manager;

public enum ServerResponse {

    EMPTY(""),
    INVALID_DATA("invalidData"),
    LOGIN_NOT_EXIST("loginNotExist"),
    AUTHENTICATION_ERROR("authenticationError"),
    REGISTRATION_SUCCESS("registrationSuccess"),
    REGISTRATION_ERROR("registrationError"),
    PASSWORD_SENT("passwordSent"),
    UNABLE_GET_DATA("unableGetData"),
    SEARCH_USERS_SUCCESS("searchUsersSuccess"),
    SEARCH_USERS_WARNING("searchUsersWarning"),
    SEARCH_USERS_ERROR("searchUsersError"),
    SHOW_USER_ERROR("showUserError"),
    ADD_USER_SUCCESS("addUserSuccess"),
    ADD_USER_ERROR("addUserError"),
    UNABLE_GET_USER_ID("unableGetUserId"),
    UNABLE_GET_USER_BY_USER_ID("unableGetUserByUserId"),
    ACCOUNT_CREATED_SUCCESS("accountCreatedSuccess"),
    MANY_ACCOUNT_WITH_THIS_CURRENCY_ERROR("manyAccountWithThisCurrencyError"),
    ACCOUNT_CREATED_ERROR("accountCreatedError"),
    ACCOUNT_ATTACHED_SUCCESS("accountAttachedSuccess"),
    ACCOUNT_ATTACHED_ERROR("accountAttachError"),
    DATA_UPDATED_SUCCESS("dataUpdatedSuccess"),
    PASSWORD_NOT_MATCH_ERROR("passwordNotMatchError"),
    PHONE_EXIST_ERROR("phoneExistError"),
    EMAIL_EXIST_ERROR("emailExistError"),
    DATA_UPDATED_ERROR("dataUpdatedError"),
    PASSWORD_UPDATED_SUCCESS("passwordUpdatedSuccess"),
    OLD_PASSWORD_ERROR("oldPasswordError"),
    NEW_PASSWORD_ERROR("newPasswordError"),
    PASSWORD_UPDATED_ERROR("passwordUpdatedError"),
    USER_DELETED_SUCCESS("userDeletedSuccess"),
    USER_HAS_FUNDS_ERROR("userHasFundsError"),
    PROFILE_DELETED_ERROR("profileDeletedError"),
    USER_DELETED_ERROR("userDeletedError"),
    SEARCH_PAYMENTS_SUCCESS("searchPaymentsSuccess"),
    SEARCH_PAYMENTS_WARNING("searchPaymentsWarning"),
    SEARCH_PAYMENTS_ERROR("searchPaymentsError"),
    SHOW_USER_PAYMENTS_ERROR("showUserPaymentsError"),
    SHOW_USER_ACCOUNTS_ERROR("showUserAccountsError"),
    UNABLE_GET_ACCOUNT_ID("unableGetAccountId"),
    UNABLE_GET_ACCOUNT_BY_USER_ID("unableGetAccountByUserId"),
    UNABLE_GET_CARD_ID("unableGetCardId"),
    UNABLE_GET_CARD("unableGetCard"),
    UNABLE_GET_CARDS("unableGetCards"),
    SEARCH_ACCOUNTS_SUCCESS("searchAccountsSuccess"),
    SEARCH_ACCOUNTS_WARNING("searchAccountsWarning"),
    SEARCH_ACCOUNTS_ERROR("searchAccountsError"),
    SHOW_ACCOUNTS_ERROR("showAccountsError"),
    SHOW_ACCOUNT_ERROR("showAccountError"),
    ACCOUNT_BLOCKED_SUCCESS("accountBlockedSuccess"),
    ACCOUNT_BLOCKED_ERROR("accountBlockedError"),
    ACCOUNT_UNBLOCKED_SUCCESS("accountUnblockedSuccess"),
    ACCOUNT_UNBLOCKED_ERROR("accountUnblockedError"),
    ACCOUNT_DELETED_SUCCESS("accountDeletedSuccess"),
    ACCOUNT_HAS_FUNDS_ERROR("accountHasFundsError"),
    ACCOUNT_DELETED_ERROR("accountDeletedError"),
    CARD_BLOCKED_SUCCESS("cardBlockedSuccess"),
    CARD_BLOCKED_ERROR("cardBlockedError"),
    CARD_UNBLOCKED_SUCCESS("cardUnblockedSuccess"),
    CARD_UNBLOCKED_ERROR("cardUnblockedError"),
    CARD_ATTACHED_SUCCESS("cardAttachedSuccess"),
    VALIDITY_EXPIRED_ERROR("validityExpiredError"),
    CARD_ALREADY_ATTACHED_ERROR("cardAlreadyAttachedError"),
    CARD_ATTACHED_ERROR("cardAttachedError"),
    CARD_DETACHED_SUCCESS("cardDetachedSuccess"),
    CARD_DETACHED_ERROR("cardDetachedError"),
    UNABLE_GET_PAYMENT("unableGetPayment"),
    UNABLE_GET_PAYMENT_ID("unableGetPaymentId"),
    UNABLE_GET_PAYMENT_BY_USER_ID("unableGetPaymentByUserId"),
    UNABLE_GET_PAYMENTS("unableGetPayments"),
    SHOW_PAYMENT_ERROR("showPaymentError"),
    PAYMENT_COMPLETED_SUCCESS("paymentCompletedSuccess"),
    RECIPIENT_ACCOUNT_NOT_EXIST_ERROR("recipientAccountNotExistError"),
    PAYMENT_TO_YOUR_ACCOUNT_ERROR("paymentToYourAccountError"),
    SENDER_ACCOUNT_BLOCKED_ERROR("senderAccountBlockedError"),
    RECIPIENT_ACCOUNT_BLOCKED_ERROR("recipientAccountBlockedError"),
    RECIPIENT_CARD_NOT_EXIST_OR_BLOCKED_ERROR("recipientCardNotExistOrBlockedError"),
    INSUFFICIENT_FUNDS_ERROR("insufficientFundsError"),
    SEARCH_LETTERS_SUCCESS("searchLettersSuccess"),
    SEARCH_LETTERS_WARNING("searchLettersWarning"),
    SEARCH_LETTERS_ERROR("searchLettersError"),
    SHOW_LETTERS_ERROR("showLettersError"),
    UNABLE_GET_LETTER_ID("unableGetLetterId"),
    SHOW_LETTER_ERROR("showLetterError"),
    LETTER_PROCESSED_SUCCESS("letterProcessedSuccess"),
    LETTER_WAS_PROCESSED("letterWasProcessed"),
    LETTER_PROCESSED_ERROR("letterProcessedError"),
    LETTER_SENT_SUCCESS("letterSentSuccess"),
    MANY_LETTERS_SENT_ERROR("manyLettersSentError"),
    LETTER_SENT_ERROR("letterSentError"),
    SHOW_ACTION_LOG_ERROR("showActionLogError"),
    SEARCH_LOG_ENTRIES_SUCCESS("searchLogEntriesSuccess"),
    SEARCH_LOG_ENTRIES_WARNING("searchLogEntriesWarning"),
    SEARCH_LOG_ENTRIES_ERROR("searchLogEntriesError"),
    CLEAR_ACTION_LOG_SUCCESS("clearActionLogSuccess"),
    CLEAR_ACTION_LOG_ERROR("clearActionLogError");

    private final String response;

    ServerResponse(String response) {
        this.response = response;
    }

    public String getResponse() {
        return response;
    }

}